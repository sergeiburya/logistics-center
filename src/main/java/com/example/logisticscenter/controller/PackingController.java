package com.example.logisticscenter.controller;

import com.example.logisticscenter.model.Packing;
import com.example.logisticscenter.repository.PackingRepository;
import com.example.logisticscenter.service.PackingService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.Map;

@Controller
public class PackingController {
    private final PackingService packingService;

    public PackingController(PackingService packingService) {
        this.packingService = packingService;
    }

    @GetMapping("/packing")
    public String getAll(
            @RequestParam (name="name",
                    required = false,
                    defaultValue = "List of packaging types.") String name,
            Map<String, Object> model) {
        model.put("name", name);
     return "getAllpacking";
    }

    @PostMapping
    public String addPacking(@RequestBody String vendorCode,
                             @RequestBody String name,
                             @RequestBody double length,
                             @RequestBody double width,
                             @RequestBody double height) {
        Packing packing = new Packing();
        packing.setVendorCode(vendorCode);
        packing.setName(name);
        packing.setHeight(height);
        packing.setLength(length);
        packing.setWidth(width);
        packingService.save(packing);
        return "addPacking";
    }
}
