package com.example.logisticscenter.controller;

import com.example.logisticscenter.model.Packing;
import com.example.logisticscenter.service.PackingService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class PackingController {
    private final PackingService packingService;

    public PackingController(PackingService packingService) {
        this.packingService = packingService;
    }

    @GetMapping("/all-packing")
    public String getAll(Map<String, Object> model) {
        List<Packing> packingList = packingService.getAll();
        model.put("packings", packingList);
     return "all-packing";
    }

    @PostMapping ("/addPacking")
    public String addPacking(
            @RequestParam String vendorCode,
            @RequestParam String name,
            @RequestParam double length,
            @RequestParam double width,
            @RequestParam double height,
            Map<String, Object> model) {
        Packing packing = new Packing();
        packing.setVendorCode(vendorCode);
        packing.setName(name);
        packing.setHeight(height);
        packing.setLength(length);
        packing.setWidth(width);
        packingService.save(packing);
        List<Packing> packings = packingService.getAll();
        model.put("name", packings);
        return "addPacking";
    }


    @GetMapping("/addPacking")
    public String addPacking(Map<String, Object> model) {
        List<Packing> packings = packingService.getAll();
        model.put("name", packings);
        return "addPacking";
    }
}
