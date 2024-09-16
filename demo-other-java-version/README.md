## DemoTypeInference 冇咩用
-即係自創type
-implictly 既type係第一次assign落去既value
  -eg: private Nicnic x;
        x = 5.0; // 咁type Nicnic就係double implicitly.
  -第一次assign唔可以null
  -唔support Lambda

## SwitchExpression 好好用
# Java 14
-除左Enum係 define左range, 咁就可以寫齊唔洗 default
    -其他typr都要default, 因為太多可能性, 特別String係無限
  1. It help check missing/ duplicated enum value (Not Allow)
  2. Not require "break". Instead, we return the value directly.
  3. Switch expression has to return something.

## Record 唔用為妙
# Java 16
- 好懶, 知道有就得. 改Class to record
- 就constructor, getter, setter都唔洗寫
  - 只會寫壞手勢, 少用
  -Support @Override