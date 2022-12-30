package by.vitalylobatsevich.teachme.liquibase

import liquibase.changelog.IncludeAllFilter

class ExcludeMainChangeLogFilter : IncludeAllFilter {

    override fun include(changeLogPath: String?) =
        changeLogPath != "db/changelog/db.changelog-main.yaml"

}
