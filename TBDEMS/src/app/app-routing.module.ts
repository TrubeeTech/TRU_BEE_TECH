import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

const routes: Routes = [
  { path: '', loadChildren: './tabs/tabs.module#TabsPageModule' },
  { path: 'mydocs', loadChildren: './mydocs/mydocs.module#MydocsPageModule' },
  { path: 'Dashboard', loadChildren: './dashboard/dashboard.module#DashboardPageModule' }
];
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}
