package club.evolutioniot.ssh.common.web.action;

import club.evolutioniot.ssh.common.util.GenericUtils;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
/**
 * 封裝Action部分。
 * <p>繼承ActionSupport
 * <p>實現接口ModelDriven，實現模型驅動
 * @author EVolution
 * @param <T>
 */
public class BaseAction<T> extends ActionSupport implements ModelDriven<T> {

    protected T t;
    private Class<T> clazz = GenericUtils.getSuperClassGenericActualTypeArguments(this.getClass(),0);
    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    @Override
    public T getModel() {
        if(this.t==null){
            try {
                this.t=this.clazz.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

        }
        return this.t;
    }
}
