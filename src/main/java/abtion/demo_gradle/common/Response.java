package abtion.demo_gradle.common;

/**
 * @author abtion
 * @since 2018/4/17 17:49
 * email abtion@outlook.com
 */
public class Response<T> {
    private int code;

    private Object data;

    public Response(int code, Object data) {
        this.code = code;
        this.data = data;
    }

    public Response() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
