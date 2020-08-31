package cn.kerninventory.mybatis.gen.tkmybatis.gen;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * <p>
 *     Parent interface of mappers.
 * </p>
 *
 * @author Kern
 */
public interface MyMapper <T> extends Mapper<T>, MySqlMapper<T> {
}
