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
        if (this.undoStack.isEmpty()){
            this.redoStack.push(this.text);
            System.out.println("Nothing to undo.");
        }
        this.redoStack.push(this.text);
        this.text = undoStack.pop();
       }
        // try{
        //     this.text = undoStack.pop();
        // }
        //  catch (Exception e){
        //     System.out.println("Nothing to undo.");
        // }

        // if(redoStack != null && undoStack != null)

    public void redo(){
        if (this.redoStack.isEmpty()){
            System.out.println("Nothing to redo.");
        }
        this.text = redoStack.pop();
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
    System.out.println(editor); // Hello World!
    editor.append("ABC");
    System.out.println(editor); // Hello World!ABC
    editor.undo();
    editor.undo();
    editor.undo();
    editor.undo();
    editor.undo();
    editor.undo();
    System.out.println(editor); // Hello 
    editor.redo();
    editor.redo();
    editor.redo();
    System.out.println(editor); // Hello World!
  }

}