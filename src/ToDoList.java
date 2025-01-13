import java.util.ArrayList;
import java.util.Scanner;

    public class ToDoList {
        private ArrayList<String> items;
        private Scanner scanner;

        public ToDoList () {
            items = new ArrayList<>();
            scanner = new Scanner(System.in);
        }

        public void run() {
            boolean exit = false;
            while(!exit) {
                System.out.println("Choose an action: [1] Add Item [2] Edit Item [3] Delete Item [4] List Items [5] Exit");
                int action = scanner.nextInt();

                switch(action) {
                    case 1:
                        addItem();
                        break;
                    case 2:
                        editItem()
                        break;
                    case 3:
                        deleteItem();
                        break;
                    case 4:
                        listItems();
                        break;
                    case 5:
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid action. Please try again.");
                        break;
                }
            }
        }

        private void addItem() {
            System.out.print("Enter item: ");
            String item = scanner.nextLine();
            items.add(item);
            System.out.println("Item added.");
        }

        private void editItem() { viewItems();
            System.out.print("Enter item number to edit: ");
            int index = scanner.nextInt(); scanner.nextLine(); // Consume newline
            if(index >= 0 && index < items.size())
            { System.out.print("Enter new item: ");
                String newItem = scanner.nextLine();
                items.set(index, newItem);
                System.out.println("Item edited.");
            }
            else { System.out.println("Invalid item number.");
            }
        } private void removeItem() { viewItems();
            System.out.print("Enter item number to remove: ");
            int index = scanner.nextInt(); scanner.nextLine(); // Consume newline
            if(index >= 0 && index < items.size())
            { items.remove(index);
                System.out.println("Item removed.");
            }
            else { System.out.println("Invalid item number.");
            }
        } private void viewItems() {
            System.out.println("To-Do List Items:");
            for(int i = 0; i < items.size(); i++)
            { System.out.println((i + 1) + ". " + items.get(i)); }
        }


    }
