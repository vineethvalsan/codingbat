public boolean loneTeen(int a, int b) {
  boolean a1 = a>=13&&a<=19;
  boolean b1= b>=13&&b<=19;
  return (a1||b1) && !(a1&&b1);
}
