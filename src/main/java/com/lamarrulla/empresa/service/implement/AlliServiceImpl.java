package com.lamarrulla.empresa.service.implement;

import com.global.iop.api.IopClient;
import com.global.iop.api.IopClientImpl;
import com.global.iop.api.IopRequest;
import com.global.iop.api.IopResponse;
import com.global.iop.domain.Protocol;
import com.global.iop.util.Constants;
import com.global.iop.util.FileItem;
import com.lamarrulla.empresa.dto.TokenDataDto;
import com.lamarrulla.empresa.service.IAlliService;
import com.lamarrulla.empresa.service.ITokenDataService;
import org.springframework.stereotype.Service;
import java.util.List;
import static com.lamarrulla.empresa.entity.Globals.*;

@Service
public class AlliServiceImpl implements IAlliService {
    private final ITokenDataService iTokenDataService;
    private IopClient iopClient;
    private String token;

    TokenDataDto tokenDataDto = new TokenDataDto();

    public AlliServiceImpl(ITokenDataService iTokenDataService) {
        this.iTokenDataService = iTokenDataService;
    }

    @Override
    public String getProductsById(Integer id){
        inicializa();
        obtenerProducto();
        return null;
    }

    public void obtenerProducto(){
        try{
            //IopClient client = new IopClient(url, appkey, appSecret);
            IopRequest request = new IopRequest();
            request.setApiName("aliexpress.ds.product.get");
            request.addApiParameter("ship_to_country", "US");
            request.addApiParameter("product_id", "1005003784285827");
            request.addApiParameter("target_currency", "USD");
            request.addApiParameter("target_language", "en");
            IopResponse response = iopClient.execute(request, Protocol.TOP);
            System.out.println(response.getGopResponseBody());
            Thread.sleep(10);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public void inicializa(){
        try {
            List<TokenDataDto> tokenDataDtoList = iTokenDataService.findAll();
            tokenDataDto = tokenDataDtoList.stream().sorted((o1,o2)->o1.getExpire_time().compareTo(o2.getExpire_time())).findFirst().get();
            iopClient = new IopClientImpl(url, appkey, appSecret);
            token = tokenDataDto.getAccess_token();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }
    public void testQuery() {
        try{
            IopRequest iopRequest = new IopRequest("aliexpress.photobank.redefining.queryphotobankimagebypaths");
            iopRequest.setHttpMethod(Constants.METHOD_POST);
            iopRequest.addApiParameter("paths", "a.jpg");
            IopResponse rsp = iopClient.execute(iopRequest, token, Protocol.TOP);
            System.out.println(rsp.getGopResponseBody());
        }catch (Exception ex){
            System.out.println(ex.toString());
        }
    }
    public void testUpload() {
        try{
            IopRequest iopRequest = new IopRequest("aliexpress.image.redefining.uploadtempimage");
            iopRequest.setHttpMethod(Constants.METHOD_POST);
            iopRequest.addFileParameter("file_data", new FileItem("/Users/joey/a.png"));
            iopRequest.addApiParameter("src_file_name", "testFile");
            IopResponse rsp = iopClient.execute(iopRequest, token, Protocol.TOP);
            System.out.println(rsp.getGopResponseBody());
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }
    public void testGopTraditionalApi(){
        try{
            IopRequest iopRequest = new IopRequest("/globalopen/api/get/a");
            iopRequest.setHttpMethod(Constants.METHOD_GET);
            iopRequest.addApiParameter("apiId", "1");
            IopResponse rsp = iopClient.execute(iopRequest, Protocol.GOP);
            System.out.println(rsp.getGopResponseBody());
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }
    public void testGopRestfulApi(){
        try{
            IopRequest iopRequest = new IopRequest("/globalopen/api/getApiDsl/{region}/{env}/{apiId}");
            iopRequest.setHttpMethod(Constants.METHOD_PUT);
            iopRequest.addApiParameter("region", "global");
            iopRequest.addApiParameter("env", "PRE");
            iopRequest.addApiParameter("apiId", "1");
            IopResponse rsp = iopClient.execute(iopRequest, token, Protocol.REST_VND_2);
            System.out.println(rsp.getGopResponseBody());
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}