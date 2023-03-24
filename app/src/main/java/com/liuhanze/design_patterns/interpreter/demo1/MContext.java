package com.liuhanze.design_patterns.interpreter.demo1;

/**
 * 环境角色
 */
class MContext {

    private String input;
    private String output;

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }
}
