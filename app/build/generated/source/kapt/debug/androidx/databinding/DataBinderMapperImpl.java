package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new ferra.solution.calculator.DataBinderMapperImpl());
  }
}
