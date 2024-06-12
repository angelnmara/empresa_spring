package com.lamarrulla.empresa.service;

import com.lamarrulla.empresa.entity.Alli.RespResult;
import com.lamarrulla.empresa.entity.Alli.Result;

public interface IAlliService {
    Result getProductsById(String id);
    RespResult getCategoryById(String id);

    void itemByFeedName(String feeed);

    void categoryTree();
    void placeOrder();
}
