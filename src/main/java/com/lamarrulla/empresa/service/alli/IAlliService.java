package com.lamarrulla.empresa.service.alli;

import com.lamarrulla.empresa.entity.alli.RespResult;
import com.lamarrulla.empresa.entity.alli.Result;

public interface IAlliService {
    Result getProductsById(String id);
    RespResult getCategoryById(String id);

    void itemByFeedName(String feeed);

    void categoryTree();
    void placeOrder();
}
