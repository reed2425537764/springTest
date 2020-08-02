package cn.service.impl;

import cn.service.AccountService;

import java.util.*;

public class AccountServiceImpl4 implements AccountService {

    private String[] strs;
    private List<String> list;
    private Map<String,String> map;
    private Properties pro;

    /*注入集合数据*/

    public void setStrs(String[] strs) {
        this.strs = strs;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setPro(Properties pro) {
        this.pro = pro;
    }

    public void findAll() {
        System.out.println(Arrays.toString(strs));
        System.out.println(list);
        System.out.println(map);
        System.out.println(pro);
    }
}
