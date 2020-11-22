package com.dto;

public class Result {

    /**
     * result : {"Passes":10,"Failures":30,"Skips":5}
     * code : 0
     * message : 成功
     */

    ResultBean result;
    private int code = 0;
    private String message = null;

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static class ResultBean {
        /**
         * Passes : 10
         * Failures : 30
         * Skips : 5
         */

        private int Passes = 0;
        private int Failures = 0;
        private int Skips = 0;

        public int getPasses() {
            return Passes;
        }

        public void setPasses(int Passes) {
            this.Passes = Passes;
        }

        public int getFailures() {
            return Failures;
        }

        public void setFailures(int Failures) {
            this.Failures = Failures;
        }

        public int getSkips() {
            return Skips;
        }

        public void setSkips(int Skips) {
            this.Skips = Skips;
        }
    }
}
