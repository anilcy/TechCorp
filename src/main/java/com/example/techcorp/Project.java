public void workOneTurn () {
    for (Employee employee : team) {
        progress += employee.work();
    }       
    
    if (progress > requiredWork) {
        progress = requiredWork;
    }
}