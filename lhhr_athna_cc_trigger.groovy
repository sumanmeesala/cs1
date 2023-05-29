package hudson.cli;

import jenkins.model.Jenkins;
import hudson.model.ListView;
import lhhrmthd;

def script = new GroovyShell().parse(new File('lhhrmthd.groovy'))
Jenkins jenkins = Jenkins.getInstance()

def viewName = 'lhhr_Athna'
jenkins.addView (new ListView(viewName))

job('Athna_cc_trigger') {

    script.desc('Athna_cc_trigger')
    script.cmd('Athna_cc_trigger')
    script.pub('Athna_cc_trigger')
                   
    myView = hudson.model.Hudson.instance.getView(viewName)
    myView.doAddJobToView('athna_cc_trigger') 
    jenkins.save()
    
                        }

