package com.tensquare.base.controller;

import com.tensquare.base.pojo.Label;
import com.tensquare.base.service.LabelService;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * 标签的Controller
 */
@RestController
@RequestMapping("/label")
public class LabelController {
    @Autowired
    protected LabelService labelService;

    /*查询所有*/
    @RequestMapping(method = RequestMethod.GET)
    public Result findAll(){
        return new Result(true, StatusCode.OK,"查询成功",labelService.findAll());
    }

    /*根据id查询*/
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Result findById(@PathVariable String id){
        return  new Result(true,StatusCode.OK,"查询成功",labelService.findById(id));
    }

    /*添加*/
    @RequestMapping(method = RequestMethod.POST)
    public Result add(@RequestBody Label label){
        labelService.add(label);
        return new Result(true,StatusCode.OK,"添加成功");
    }

    /*修改*/
    @RequestMapping(value ="/{id}",method = RequestMethod.PUT)
    public Result update(@PathVariable String id,@RequestBody Label label){
        label.setId(id);
        labelService.update(label);
        return new Result(true,StatusCode.OK,"修改成功");
    }


    /*删除*/
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public Result deleteById(@PathVariable String id){
        labelService.deleteById(id);
        return new Result(true,StatusCode.OK,"删除成功");
    }

    /*条件查询*/
    @RequestMapping(value="/search",method = RequestMethod.POST)
    public Result findSearch(@RequestBody Map searchMap){
        return new Result(true,StatusCode.OK,"查询成功 ",labelService.findSearch(searchMap) );
    }


    /*条件+分页*/
/**  @RequestMapping(value = "/search/{page}/{size}")
        public Result findSearch(@RequestBody Map searchMap,@PathVariable intpage,@PathVariable int size){
        Page<Label> pageBean = labelService.findSearch(searchMap, page, size);
        return new Result(true,StatusCode.OK,"查询成功",newPageResult<>(pageBean.getTotalElements(),pageBean.getContent()) );
    }
 */
}
