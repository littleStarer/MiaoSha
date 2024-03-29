package com.miaosha.controller;

import com.miaosha.domain.MiaoshaUser;
import com.miaosha.redis.RedisService;
import com.miaosha.service.MiaoshaUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/goods")
public class GoodsController {

    private static Logger log = LoggerFactory.getLogger(GoodsController.class);

    @Autowired
    RedisService redisService;

    @Autowired
    MiaoshaUserService userService;

    @RequestMapping("/to_list")
    public String list(Model model, MiaoshaUser user ){
        model.addAttribute("user",user);
        return "goods_list";
    }





}
