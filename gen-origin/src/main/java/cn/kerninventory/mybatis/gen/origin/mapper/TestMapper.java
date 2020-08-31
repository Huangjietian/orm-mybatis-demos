package cn.kerninventory.mybatis.gen.origin.mapper;

import cn.kerninventory.mybatis.gen.origin.pojo.Test;
import cn.kerninventory.mybatis.gen.origin.pojo.TestExample;
import cn.kerninventory.mybatis.gen.origin.pojo.TestWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TestMapper {
    long countByExample(TestExample example);

    int deleteByExample(TestExample example);

    int deleteByPrimaryKey(Long cBigint);

    int insert(TestWithBLOBs record);

    int insertSelective(TestWithBLOBs record);

    List<TestWithBLOBs> selectByExampleWithBLOBs(TestExample example);

    List<Test> selectByExample(TestExample example);

    TestWithBLOBs selectByPrimaryKey(Long cBigint);

    int updateByExampleSelective(@Param("record") TestWithBLOBs record, @Param("example") TestExample example);

    int updateByExampleWithBLOBs(@Param("record") TestWithBLOBs record, @Param("example") TestExample example);

    int updateByExample(@Param("record") Test record, @Param("example") TestExample example);

    int updateByPrimaryKeySelective(TestWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TestWithBLOBs record);

    int updateByPrimaryKey(Test record);
}