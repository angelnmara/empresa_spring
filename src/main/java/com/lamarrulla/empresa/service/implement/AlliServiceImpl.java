package com.lamarrulla.empresa.service.implement;

import com.global.iop.api.IopClient;
import com.global.iop.api.IopClientImpl;
import com.global.iop.api.IopRequest;
import com.global.iop.api.IopResponse;
import com.global.iop.domain.Protocol;
import com.global.iop.util.Constants;
import com.global.iop.util.FileItem;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.lamarrulla.empresa.dto.TokenDataDto;
import com.lamarrulla.empresa.entity.Alli.RespResult;
import com.lamarrulla.empresa.entity.Alli.Result;
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
    public Result getProductsById(String id){
        inicializa();
        return obtenerProducto(id);
    }

    @Override
    public RespResult getCategoryById(String id) {
        inicializa();
        return obtenerCategoriaPorId(id);
    }

    @Override
    public void itemByFeedName(String feed) {
        inicializa();
        itemByFeedNameRepo(feed);
    }

    @Override
    public void categoryTree() {
        inicializa();
        getCategoryTree();
    }

    @Override
    public void placeOrder() {
        inicializa();
        getPlaceOrder();
    }

    private void getPlaceOrder() {
        try{
            IopRequest request = new IopRequest();
            request.setApiName("aliexpress.trade.buy.placeorder");
            request.addApiParameter("param_place_order_request4_open_api_d_t_o", "{\"product_items\":[{\"logistics_service_name\":\"EPAM\",\"sku_attr\":\"14:70221\",\"product_count\":\"2\",\"product_id\":\"1223211\",\"order_memo\":\"Please put it in a gift box.\"},{\"logistics_service_name\":\"EPAM\",\"sku_attr\":\"14:70221\",\"product_count\":\"2\",\"product_id\":\"1223211\",\"order_memo\":\"Please put it in a gift box.\"}],\"logistics_address\":{\"zip\":\"12222\",\"rut_no\":\"123-K\",\"country\":\"RU\",\"address\":\"sh Kashirskoe dom 142 (QIWI)\",\"passport_no_date\":\"02-23-2018\",\"address2\":\"sh Kashirskoe dom 142 (QIWI)\",\"city\":\"Mosco\",\"contact_person\":\"RU  TEST TEST\",\"mobile_no\":\"12334445\",\"passport_no\":\"12345\",\"locale\":\"en_US\",\"foreigner_passport_no\":\"123456789\",\"location_tree_address_id\":\"903200190000000000-903200190137000000\",\"full_name\":\"RU  TEST TEST\",\"province\":\"Mosco\",\"is_foreigner\":\"true\",\"tax_number\":\"xxx\",\"tax_company\":\"Soceite General\",\"cpf\":\"111\",\"passport_organization\":\"xxxx\",\"phone_country\":\"+7\",\"vat_no\":\"123456778\"},\"out_order_id\":\"123456789\"}");
            IopResponse response = iopClient.execute(request, token, Protocol.TOP);
            System.out.println(response);
            Thread.sleep(10);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    private void getCategoryTree() {
        try{
            IopRequest request = new IopRequest();
            request.setApiName("aliexpress.solution.seller.category.tree.query");
            request.addApiParameter("category_id", "509");
            request.addApiParameter("filter_no_permission", "true");
            IopResponse response = iopClient.execute(request, token, Protocol.TOP);
            System.out.println(response);
            Thread.sleep(10);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    private void itemByFeedNameRepo(String feed){
        try{
            IopRequest request = new IopRequest();
            request.setApiName("aliexpress.ds.recommend.feed.get");
            request.addApiParameter("country", "MX");
            request.addApiParameter("target_currency", "MXN");
            request.addApiParameter("target_language", "es");
            request.addApiParameter("page_size", "50");
            request.addApiParameter("sort", "priceAsc");
            request.addApiParameter("page_no", "1");
            request.addApiParameter("category_id", null);
            request.addApiParameter("feed_name", "DS " + feed);
            IopResponse response = iopClient.execute(request, Protocol.TOP);
            System.out.println(response);
            Thread.sleep(10);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    private RespResult obtenerCategoriaPorId(String id) {
        RespResult gopResponseBody = new RespResult();
        try{
            IopRequest request = new IopRequest();
            request.setApiName("aliexpress.ds.category.get");
            request.addApiParameter("categoryId", id);
            request.addApiParameter("language", "es");
            request.addApiParameter("app_signature", "your signature");
            IopResponse response = iopClient.execute(request, Protocol.GOP);
            Gson gson = new Gson();
            JsonParser parser = new JsonParser();
            JsonObject object = (JsonObject) parser.parse(response.getGopResponseBody());
            gopResponseBody = gson.fromJson(object.get("resp_result"), RespResult.class);
            System.out.println(gopResponseBody);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }finally {
            return gopResponseBody;
        }
    }

    public Result obtenerProducto(String id){
        Result result = new Result();
        try{
            //IopClient client = new IopClient(url, appkey, appSecret);
            IopRequest request = new IopRequest();
            request.setApiName("aliexpress.ds.product.get");
            request.addApiParameter("ship_to_country", "MX");
            request.addApiParameter("product_id", id);
            request.addApiParameter("target_currency", "MXN");
            request.addApiParameter("target_language", "es");
            IopResponse response = iopClient.execute(request, Protocol.TOP);
            Gson gson = new Gson();
            JsonParser parser = new JsonParser();
            JsonObject object = (JsonObject) parser.parse(response.getGopResponseBody());
            result = gson.fromJson(object.get("result"), Result.class);
            System.out.println(result);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }finally {
            return result;
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