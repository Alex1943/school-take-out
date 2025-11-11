package com.sky.service;

import com.sky.dto.DishDTO;
import org.springframework.stereotype.Service;

/**
 * ClassName: DishService
 * Package: com.sky.service
 * Description:
 *
 * @Author 李皓天
 * @Create 2025/11/3 17:30
 * @Version 1.0
 */

public interface DishService {
    /**
     * 新增菜品和对应的口味
     * @param dishDTO
     */
    public void saveWithFlavor(DishDTO dishDTO);
}
