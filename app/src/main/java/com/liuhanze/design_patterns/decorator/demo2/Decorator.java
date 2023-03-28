package com.liuhanze.design_patterns.decorator.demo2;

class Decorator implements SchoolReport{

    private SchoolReport schoolReport;

    public Decorator(SchoolReport report){
        schoolReport = report;
    }

    @Override
    public void report() {
        schoolReport.report();
    }

    @Override
    public void sign(String name) {
        schoolReport.sign(name);
    }
}
