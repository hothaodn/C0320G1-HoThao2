//package com.meomeo.blog_application_mini_project.validation;
//
//import javax.validation.ConstraintValidator;
//import javax.validation.ConstraintValidatorContext;
//
//public class NameValidator implements ConstraintValidator<LodaId, String> {
//    private static final String LODA_PREFIX = "loda://";
//
//    /**
//     * Kiểm tra tính hợp lệ của trường được đánh dấu bởi @LodaId
//     * @param s
//     * @param constraintValidatorContext
//     * @return
//     */
//    @Override
//    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
//        if (s == null || s.isEmpty()) return false;
//
//        return s.startsWith(LODA_PREFIX);
//    }
//}
