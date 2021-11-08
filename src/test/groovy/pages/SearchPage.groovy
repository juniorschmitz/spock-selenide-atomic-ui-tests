package pages

import com.codeborne.selenide.*;
import static com.codeborne.selenide.Selenide.*;

class SearchPage {
    private ElementsCollection productResults = $$('.ajax_block_product');

    def resultsCount() {
        sleep(1000);
        return productResults.size()
    }
}
