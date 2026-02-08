package com.example.recruitmenttrainingsystem.dto;


import lombok.*;
import java.math.BigDecimal;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CourseScoreDto {
    private String courseName;      // Git / Java / SQL
    private BigDecimal theoryScore;
    private BigDecimal practiceScore;
    private BigDecimal attitudeScore;
    private BigDecimal totalScore;
    private String reason;

    private List<CourseScoreHistoryDto> history;
    private Integer totalAttempts;
    private Integer remainingAttempts;
}
