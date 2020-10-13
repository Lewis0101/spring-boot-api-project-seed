package org.lewis.management.system.common;

/**
 * 功能描述: 通用的常量
 *
 */
public final class BusinessConstants {
    private BusinessConstants(){}
    /**
     * 工作机器ID(0~31)
     */
    public static final long WORKER_ID = 1L;

    /**
     * 数据中心ID(0~31)
     */
    public static final long DATA_CENTER_ID = 5L;

    /**
     * 默认的分页数量
     */
    public static final Integer DEFAULT_PAGE_NUM = 10;

    /**
     * 最大的分页数量
     */
    public static final Integer MAX_PAGE_NUM = 1000;

    /**
     * 最小的页码1
     */
    public static final Integer MIN_PAGE_INDEX = 1;


    /**
     * DESC
     */
    public static final String ORDER_BY_RULE_DESC = "DESC";

    /**
     * 用&&进行字符串分隔
     */
    public static final String SUFFIX_WORD = "&&";

}
