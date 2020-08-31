package cn.kerninventory.mybatis.gen.tkmybatis.mapper;

import cn.kerninventory.mybatis.gen.tkmybatis.gen.MyMapper;
import cn.kerninventory.mybatis.gen.tkmybatis.pojo.Test;
import cn.kerninventory.mybatis.gen.tkmybatis.pojo.TestExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TestMapper extends MyMapper<Test> {
    long countByExample(TestExample example);

    int deleteByExample(TestExample example);

//    List<TestWithBLOBs> selectByExampleWithBLOBs(TestExample example);

    List<Test> selectByExample(TestExample example);

//    int updateByExampleSelective(@Param("record") TestWithBLOBs record, @Param("example") TestExample example);

//    int updateByExampleWithBLOBs(@Param("record") TestWithBLOBs record, @Param("example") TestExample example);

    int updateByExample(@Param("record") Test record, @Param("example") TestExample example);
}