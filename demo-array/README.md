### Array
- Declare and initialize an array
    - approach 1
    String[] arr5 = new String[3];
    - approach 2
    String[] arr6 = new String[] {"abc", "def", "ijk"}; 
    - approach 3
    String[] arr7 = {"abc", "def", "ijk"};

## Method
- Arrays.toString(OBJ)
- Bubble Sort i L253 /DemoArray.java
- Backup Array
  -  int[] backupArray = Arrays.copyOf(arr21, arr21.length);
- Swap
  - char backup;
    backup = arr9[0]; // 將 h 放入backup
    arr9[0] = arr9[1]; // 將 a 覆蓋 [0]既h
    arr9[1] = backup;
- Print 2D Array
  - Arrays.deepToString(2Darrname)