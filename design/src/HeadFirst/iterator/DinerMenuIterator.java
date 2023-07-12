package HeadFirst.iterator;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {
  MenuItem[] items;
  int position = 0;

  public DinerMenuIterator(MenuItem[] menuItems) {
    this.items = menuItems;
  }

  @Override
  public boolean hasNext() {
    return position < items.length && items[position] != null;
  }

  @Override
  public MenuItem next() {
    MenuItem menuItem = items[position];
    position++;
    return menuItem;
  }

  public void remove() {
    throw new UnsupportedOperationException("메뉴 항목은 지우면 안 됩니다.");
  }
}
