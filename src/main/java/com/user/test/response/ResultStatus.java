package com.user.test.response;

public class ResultStatus {

    private final static int RESULT_SUCCESS = 0;
    private final static int RESULT_ERROR= 1 ;

    private int code;

    private String msg;

    private Object data;



    public ResultStatus() {
        super();
        // TODO Auto-generated constructor stub
    }

    public ResultStatus(int code, String msg, Object data) {
        super();
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static com.user.test.response.ResultStatus success(){
        return new com.user.test.response.ResultStatus(RESULT_SUCCESS,"成功",null);
    }
    public static com.user.test.response.ResultStatus success(Object data){
        return new com.user.test.response.ResultStatus(RESULT_SUCCESS,"成功",data);
    }
    public static com.user.test.response.ResultStatus error(Object data){
        return new com.user.test.response.ResultStatus(RESULT_ERROR,null,data); }

    public static com.user.test.response.ResultStatus error(String msg, Object data){
        return new com.user.test.response.ResultStatus(RESULT_ERROR,msg,data); }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


    @Override
    public String toString() {
        return "ResultStatus{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}

