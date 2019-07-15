package mapper;

import java.util.List;
import model.OrderItems;
import model.OrderItemsExample;
import org.apache.ibatis.annotations.Param;

public interface OrderItemsMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(OrderItemsExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(OrderItemsExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(Integer orderItemId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(OrderItems record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(OrderItems record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<OrderItems> selectByExample(OrderItemsExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    OrderItems selectByPrimaryKey(Integer orderItemId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("record") OrderItems record, @Param("example") OrderItemsExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("record") OrderItems record, @Param("example") OrderItemsExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(OrderItems record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(OrderItems record);
}