package mapper;

import java.util.List;
import model.Customers;
import model.CustomersExample;
import org.apache.ibatis.annotations.Param;

public interface CustomersMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(CustomersExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(CustomersExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(Integer customerId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(Customers record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(Customers record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<Customers> selectByExample(CustomersExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    Customers selectByPrimaryKey(Integer customerId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("record") Customers record, @Param("example") CustomersExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("record") Customers record, @Param("example") CustomersExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(Customers record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(Customers record);
}