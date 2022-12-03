class BrowserHistory {
    String page ;
    ArrayList<String> back = new ArrayList<String>();
    ArrayList<String> front = new ArrayList<String>();
    public BrowserHistory(String homepage) {
        page = homepage;
    }
    
    public void visit(String url) {
        back.add(page);
        page = url;
        front.clear();
    }
    
    public String back(int steps) {
      while(back.size()>0 && steps>0){
          steps--;
          front.add(0,page);
          page = back.get(back.size()-1);
          back.remove(back.size()-1);
      }
        return page;
    }
    
    public String forward(int steps) {
        while(front.size()>0 && steps>0){
            steps--;
            back.add(page);
            page = front.get(0);
            front.remove(0);
        }
        return page;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */