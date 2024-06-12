package com.lamarrulla.empresa.controller;

import com.lamarrulla.empresa.entity.Alli.RespResult;
import com.lamarrulla.empresa.entity.Alli.Result;
import com.lamarrulla.empresa.service.IAlliService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/private/alli")
public class AlliController {
    private final IAlliService iAlliService;

    public AlliController(IAlliService iAlliService) {
        this.iAlliService = iAlliService;
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Result> getProductById(@PathVariable String id) {
        return ResponseEntity.ok(iAlliService.getProductsById(id));
    }

    @GetMapping("/categoria/{id}")
    public ResponseEntity<RespResult> getCategoryById(@PathVariable String id){
        return ResponseEntity.ok(iAlliService.getCategoryById(id));
    }

    @GetMapping("/categoria/feedname/{feed}")
    public ResponseEntity<String> itemByFeedName(@PathVariable String feed){
        iAlliService.itemByFeedName(feed);
        return ResponseEntity.ok("ok");
    }

    @GetMapping("/categoria/tree")
    public ResponseEntity<String> getCategoryTree(){
        iAlliService.categoryTree();
        return ResponseEntity.ok("Ok");
    }
    @GetMapping("place-order")
    public ResponseEntity<String> getPlaceOrder(){
        iAlliService.placeOrder();
        return ResponseEntity.ok("Ok");
    }
}
