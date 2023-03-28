package com.liuhanze.design_patterns.decorator.demo2;

public class DecoratorMain {

    public void main(){
        SchoolReport schoolReport = new ForthGradeSchoolReport();
        HighScoreDecorator highScoreDecorator = new HighScoreDecorator(schoolReport);
        SortDecorator sortDecorator = new SortDecorator(highScoreDecorator);
        sortDecorator.report();
        sortDecorator.sign("张三");

    }
}
