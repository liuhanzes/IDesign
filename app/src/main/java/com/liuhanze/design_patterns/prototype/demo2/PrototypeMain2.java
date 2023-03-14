package com.liuhanze.design_patterns.prototype.demo2;

import com.liuhanze.iutil.log.ILog;

public class PrototypeMain2 {

    public void main(){


        Resume resume1 = new Resume();
        resume1.setAge(22);
        resume1.setName("花花");
        resume1.setSex("女");
        Company company = new Company();
        company.setName("百度");
        company.setTime("2022");
        resume1.setmCompany(company);

        //浅拷贝
//        Resume resume2 = resume1.clone();
//        resume2.setName("小小");
//        resume2.getmCompany().setName("阿里巴巴");
//        resume2.getmCompany().setTime("2020");

        //深拷贝
        Resume resume2 = resume1.clone();
        resume2.setName("小小");
        resume2.setmCompany(resume1.getmCompany().clone());
        resume2.getmCompany().setName("阿里巴巴");
        resume2.getmCompany().setTime("2020");


        ILog.LogDebug("resume1 name = "+resume1.getName()+",age = "+
                resume1.getAge()+",sex = "+resume1.getSex()+",company = "
                +resume1.getmCompany().getName()+",company time = "+resume1.getmCompany().getTime());

        ILog.LogDebug("resume2 name = "+resume2.getName()+",age = "+
                resume2.getAge()+",sex = "+resume2.getSex()+",company = "
                +resume2.getmCompany().getName()+",company time = "+resume2.getmCompany().getTime());


    }
}
