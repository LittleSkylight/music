package com.lzhpo.music.controller;

import com.lzhpo.music.business.api.WangyiApi;
import com.lzhpo.music.business.model.WangyiPlay;
import com.lzhpo.music.business.service.WangyiPlayService;
import com.lzhpo.music.business.vo.ResponseVO;
import com.lzhpo.music.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controller
 *
 * <p>
 * Create By IntelliJ IDEA
 * Author：lzhpo
 * </p>
 */
@Controller
public class MusicWebController {

    @Autowired
    private WangyiPlayService wangyiPlayService;
    @Autowired
    private WangyiApi wangyiApi;

    @RequestMapping("/")
    public ModelAndView player() {
        return ResultUtil.view("music");
    }

    @RequestMapping("/index.html")
    public ModelAndView index() {
        return ResultUtil.view("music");
    }

    @RequestMapping("/music.html")
    public ModelAndView music() {
        return ResultUtil.view("music");
    }

    @RequestMapping("/playList")
    @ResponseBody
    public Object list() {
        WangyiPlay wangyiPlay = wangyiPlayService.getDefault();
        return wangyiApi.getPlaylist(wangyiPlay.getPlayId());
    }

    @RequestMapping("/lrc/{musicId}")
    @ResponseBody
    public ResponseVO getLrc(@PathVariable("musicId") String musicId) {
        return wangyiApi.getLyric(musicId);
    }

}