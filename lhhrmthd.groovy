def fileLocation = getClass().protectionDomain.codeSource.location
println fileLocation


def desc(name) {
    description("This is an $name Job DSL job")
}

def cmd(name) {
    steps {
        shell("echo I'm $name")
    }
}

def pub(name) {
    publishers {
        downstream('ou_substitution_b_m_athna')
    }
}

def axs(name) {                 
    axes {
        axis {
            name('corpId')
            valueString(CC_CLIENTS)
        }
    }
}
