package com.lamarrulla.empresa.controller;

import com.lamarrulla.empresa.dto.CommunityCatDto;
import com.lamarrulla.empresa.service.ICommunityCatService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/private/community-cat")
public class CommunityCatController {
    private final ICommunityCatService iCommunityCatService;

    public CommunityCatController(ICommunityCatService iCommunityCatService) {
        this.iCommunityCatService = iCommunityCatService;
    }
    @GetMapping("/{id}")
    public ResponseEntity<CommunityCatDto> findById(@PathVariable Integer id){
        return ResponseEntity.ok(iCommunityCatService.findById(id));
    }
    @PostMapping
    public ResponseEntity<CommunityCatDto> save(@RequestBody CommunityCatDto communityCatDto){
        return ResponseEntity.ok(iCommunityCatService.save(communityCatDto));
    }

    @GetMapping
    public ResponseEntity<List<CommunityCatDto>> findAll(){
        return ResponseEntity.ok(iCommunityCatService.findAll());
    }
}
