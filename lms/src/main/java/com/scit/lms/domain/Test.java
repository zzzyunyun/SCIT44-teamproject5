package com.scit.lms.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Test {
    int testid;
    String testname;
    int categoryid;
    String testdate;
    String testlimit;


}
