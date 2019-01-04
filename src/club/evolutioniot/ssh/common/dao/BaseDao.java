package club.evolutioniot.ssh.common.dao;

import java.io.Serializable;
import java.util.List;

/**
 * BaseDao接口  封装 HibernateTemplate的增删改查功能，基于传入泛型值对pojo进行处理
 * @author EVolution
 * 2018年11月1日-下午2:04:12
 * @param <T>
 */
public interface BaseDao<T> {
    void save(T t);

    void delete(T t);

    void update(T t);

    T findById(Serializable id);

    List<T> findAll();
	/**
	 * 執行查詢語句，根據傳入的where條件，拼接HQL語句
	 * <p/>
	 * String hql = " from " + this.entityClass.getSimpleName() + " o " + whereHQL;
	 * @param whereHQL
	 * @param params
	 * @return 汎型列表
	 */
    <P> List<T> find(String whereHQL, P... params);
	/**
	 * 執行查詢語句，根據Service層拼接的HQL語句進行查詢
	 * @param hql
	 * @param params
	 * @return
	 */
    <P> List<Object> findByHQL(String hql, P... params);
}
