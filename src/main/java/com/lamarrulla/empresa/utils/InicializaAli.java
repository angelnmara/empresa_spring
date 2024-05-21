package com.lamarrulla.empresa.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.global.iop.api.IopClient;
import com.global.iop.api.IopClientImpl;
import com.global.iop.api.IopRequest;
import com.global.iop.api.IopResponse;
import com.global.iop.domain.Protocol;
import com.lamarrulla.empresa.dto.TokenDataDto;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;


@Component
public class InicializaAli {

    /*https://api-sg.aliexpress.com/oauth/authorize?response_type=code&force_auth=true&redirect_uri=https://nidiablanisanta.shop&client_id=507100*/
    String url = "https://api-sg.aliexpress.com";
    String appkey = "507100";
    String appSecret = "mXFsUEtzJp7EZkGlsoajtaaofydHCA0t";
    String action = "/auth/token/create";
    @PostConstruct
    public void ManejaCredenciales() {
        System.out.println("Obtiene token");
        IopClient client = new IopClientImpl(url, appkey, appSecret);
        IopRequest request = new IopRequest();
        request.setApiName(action);
        request.addApiParameter("code", "3_507100_B4ymYCtBR2HzDLjxDs0yc21e18590");
        try {
            IopResponse response = client.execute(request, Protocol.GOP);
            Object object = JSON.toJSON(response);
            JSONObject jsonObject = (JSONObject) object;
            if((Boolean) jsonObject.get("success")){
                TokenDataDto tokenDataDto = JSON.parseObject(jsonObject.get("gopResponseBody").toString(), TokenDataDto.class);
                System.out.println(tokenDataDto.getAccess_token());
            }else{
                System.out.println("Existe un error en el logeo");
            }

            /*if((Boolean) object.){
                TokenDataDto tokenDataDto = JSON.parseObject(jsonObject.toString(), TokenDataDto.class);
                System.out.println(tokenDataDto);
            }*/
        } catch (Exception e) {
            e.printStackTrace();
        }
    }





}
