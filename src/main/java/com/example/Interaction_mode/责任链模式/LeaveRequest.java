package com.example.Interaction_mode.责任链模式;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 封装请假的基本信息
 */
@Data
@AllArgsConstructor
public class LeaveRequest {
    private String empName; // 员工名称
    private int leaveDays;  // 请假天数
    private String reason;  // 请假理由

}
