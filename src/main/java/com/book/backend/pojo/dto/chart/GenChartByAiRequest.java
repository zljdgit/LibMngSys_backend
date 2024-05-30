package com.book.backend.pojo.dto.chart;

import lombok.Data;

import java.io.Serializable;

@Data
public class GenChartByAiRequest implements Serializable {

    /**
     * 名称
     */
    private String name;

    /**
     * 分析目标
     */
    private String goal;

    /**
     * 图表类型
     */
    private String chartType;
    /**
     * 用户id
     */
    private Long adminId;
    private static final long serialVersionUID = 1L;
}
