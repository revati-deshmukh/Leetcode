public class CountCollisions {
    /**
     *  if(!stack.isEmpty() && stack.peek() == ch){
     *                 stack.pop();
     *                 count += 0;
     *             } else {
     *                 if(ch == 'L' && !stack.isEmpty()){
     *                     if(stack.peek() == 'R'){
     *                         count += 2;
     *                     } else if(stack.peek() == 'S'){
     *                         count += 1;
     *                     }
     *                     System.out.println(ch + " count " + count);
     *                 } else if(ch == 'R' && !stack.isEmpty()){
     *                     if(stack.peek() == 'L'){
     *                         count += 2;
     *                     } else if(stack.peek() == 'S'){
     *                         count += 1;
     *                     }
     *                     System.out.println(ch + " count " + count);
     *                 } else if(ch == 'S' && !stack.isEmpty() && (stack.peek() == 'L' || stack.peek() == 'R')){
     *                     count += 1;
     *                     System.out.println(ch + " count " + count);
     *                 }
     *                 stack.push(ch);
     *             }
     **/

    /**
     * if(stack.isEmpty()){
     *                 stack.push(ch);
     *             } else {
     *                 if((ch == 'L' && stack.peek() == 'R') || (ch == 'R' && stack.peek() == 'L')){
     *                     count += 2;
     *                     while(!stack.isEmpty()){
     *                         stack.pop();
     *                     }
     *                     System.out.println("ch "+ ch + " " + stack + " 1st if else " + count);
     *                 } else if((ch == 'L' && stack.peek() == 'S') || (ch == 'R' && stack.peek() == 'S')){
     *                     count += 1;
     *                     while(!stack.isEmpty()){
     *                         stack.pop();
     *                     }
     *                     if(ch == 'L'){
     *                         stack.push('R');
     *                     } else if(ch == 'R'){
     *                         stack.push('L');
     *                     }
     *                     System.out.println("ch "+ ch + " " + stack + " 2nd if else " + count);
     *                 } else if((ch == 'S' && stack.peek() == 'L') || (ch == 'S' && stack.peek() == 'R')){
     *                     count += 1;
     *                     var peekEle = stack.peek();
     *                     while(!stack.isEmpty()){
     *                         stack.pop();
     *                     }
     *                     //if(peekEle == 'L'){
     *                     //    stack.push('R');
     *                     //} else if(peekEle == 'R'){
     *                     //    stack.push('L');
     *                     //}
     *                      stack.push('S');
     *                     System.out.println("ch "+ch +" peekEle "+peekEle +" "+stack +" 3rd if else "+count);
     *
                        } else if((ch=='L'&&stack.peek()=='L')||(ch=='R'&&stack.peek()=='R')){
     *               count+=0;
     *               System.out.println("ch "+ch+" "+stack+" 4th if else "+count);
     *               }
     *
     * }*/
}
