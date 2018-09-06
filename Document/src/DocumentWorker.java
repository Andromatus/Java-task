public class DocumentWorker {
    public void openDocument(){
        System.out.println("Документ открыт");
    }

    public void editDocument(){
        System.out.println("Редактирование документа доступно в версии Pro");
    }

    public void saveDocument(){
        System.out.println("Сохранение документа доступно в версии Pro");
    }
}

class ProDocumentWorker extends DocumentWorker{
    @Override
    public void editDocument(){
        System.out.println("Документ отредактирован");
    }

    @Override
    public void saveDocument() {
        System.out.println("Документ сохранен в старом формате, сохранение в остальных форматах доступно в версии Expert");
    }
}

class ExperDocumentWorker extends ProDocumentWorker{
    @Override
    public void saveDocument(){
        System.out.println("Документ сохранен в новом формате");
    }
}

