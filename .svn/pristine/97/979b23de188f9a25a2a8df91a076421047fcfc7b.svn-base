package club.evolutioniot.ssh.common.util;

import org.apache.commons.lang3.ArrayUtils;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class GenericUtils {
    /**
     * 获取父类中的泛型类型中的实际的参数类型
     * @author evolution
     * @param clazz
     * @param index
     * @return
     */
    public static Class getSuperClassGenericActualTypeArguments(Class clazz, Integer index) {
        if (clazz == null)
            return Object.class;
        if (index == null || index < 0)
            return Object.class;
        Type type = clazz.getGenericSuperclass();
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            if (ArrayUtils.isNotEmpty(actualTypeArguments)) {
                if (index >= ArrayUtils.getLength(actualTypeArguments)) {
                    throw new IllegalArgumentException("");
                }
                return (Class) actualTypeArguments[index];
            }
        }
        return Object.class;
    }
}
