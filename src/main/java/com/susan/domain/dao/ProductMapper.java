package com.susan.domain.dao;

import com.susan.domain.entity.Order;
import com.susan.domain.entity.Product;
import com.susan.domain.entity.SearchByKeyword;
import com.susan.domain.request.ShowDetailRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
    // 물품 등록 SQL
    Integer insertProduct(Product product);

    //물품 수정 SQL
    Integer updateProduct(Product product);

    //물품 삭제 SQL
    Integer deleteProduct(int seq);

    List<Product> findProduct();

    List<SearchByKeyword> searchDefault(String keyword);
    List<SearchByKeyword> searchDesc(String keyword);
    List<SearchByKeyword> searchAsc(String keyword);
    List<ShowDetailRequest> showDetail(String name);

}
