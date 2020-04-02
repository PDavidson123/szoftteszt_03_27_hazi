package hu.tigra.pti.geb

import geb.Page

class ErrorPage extends Page {

    static url = 'index.php?controller=authentication'

    static at = { title == 'Login - My Store' }

    static content = {
        errorBox { $('a[class="alert alert-danger"]')}
    }
}