import java.util.Deque;
import java.util.LinkedList;

public class TextEditor {
    // Word: append(), undo(), redo()
    private String text;
    private Deque<String> undoStack;
    private Deque<String> redoStack;

    public TextEditor(){
        this.text = "";
        this.undoStack = new LinkedList<>();
        this.redoStack = new LinkedList<>();
    }

    public void append(String newText){
        this.undoStack.push(this.text);
        //this.redoStack.push(newText);
        this.text += newText;
    }

    public void undo(){
        if (!this.undoStack.isEmpty()){
            this.redoStack.push(this.text);  //same as Vincent
            this.text = this.undoStack.pop();//same as Vincent  
        } else{
            System.out.println("Nothing to undo.");
        }
       }
        // try{
        //     this.text = undoStack.pop();
        // }
        //  catch (Exception e){
        //     System.out.println("Nothing to undo.");
        // }
        // if(redoStack != null && undoStack != null)

    public void redo(){
        if (!this.redoStack.isEmpty()){
            this.undoStack.push(this.text); //missing
            this.text = redoStack.pop();//same as Vincent
        }else{
            System.out.println("Nothing to redo.");
        }
    }

    @Override
    public String toString(){
        return this.text;     // 新寫法
    }
    public static void main(String[] args) {
    TextEditor editor = new TextEditor();
    editor.append("Hello");  // undoStack: "", this.text = Hello
    editor.append(" World"); // undoStack: "Hello", "", this.text = Hello World
    editor.append("!"); // undoStack: "Hello World", "Hello"  this.text = Hello World!
    System.out.println("1: " + editor); // Hello World!
    editor.append("ABC");
    System.out.println("2: " + editor); // Hello World!ABC
    editor.undo();
    editor.undo();
    editor.undo();
    System.out.println("3: " + editor);// Hello
    editor.undo();
    editor.undo();
    System.out.println("4: " + editor); // Nothing to undo.
    editor.redo();
    editor.redo();
    System.out.println("5: " + editor);
    editor.redo();
    editor.redo();
    System.out.println("6: " + editor); // Hello World!ABC
    editor.redo();
    editor.redo();
    System.out.println("7: " + editor);
  }

}