package mapper;

import java.util.List;
import model.Orders;
import model.OrdersExample;
import org.apache.ibatis.annotations.Param;

public interface OrdersMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(OrdersExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(OrdersExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(Integer orderId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(Orders record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(Orders record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<Orders> selectByExample(OrdersExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    Orders selectByPrimaryKey(Integer orderId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("record") Orders record, @Param("example") OrdersExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("record") Orders record, @Param("example") OrdersExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(Orders record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(Orders record);
}