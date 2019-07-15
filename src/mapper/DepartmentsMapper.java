package mapper;

import java.util.List;
import model.Departments;
import model.DepartmentsExample;
import org.apache.ibatis.annotations.Param;

public interface DepartmentsMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(DepartmentsExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(DepartmentsExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(Integer departmentId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(Departments record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(Departments record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<Departments> selectByExample(DepartmentsExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    Departments selectByPrimaryKey(Integer departmentId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("record") Departments record, @Param("example") DepartmentsExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("record") Departments record, @Param("example") DepartmentsExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(Departments record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(Departments record);
}